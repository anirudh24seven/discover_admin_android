package com.toastmasters.discoveradmin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.codescanner.GmsBarcodeScannerOptions
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning
import com.toastmasters.discoveradmin.ui.theme.DiscoverAdminTheme
import org.phoenixframework.liveview.ui.phx_components.LiveView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            QRScreen()
        }
    }
}

@Composable
fun QRScreen() {
    DiscoverAdminTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            val applicationContext = LocalContext.current.applicationContext
            var scanResult by remember { mutableStateOf("Scan result:") }
            var showContinue by remember { mutableStateOf(false) }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Button(onClick = {
                        val options = GmsBarcodeScannerOptions.Builder()
                            .setBarcodeFormats(Barcode.FORMAT_QR_CODE)
                            .enableAutoZoom()
                            .build()

                        val scanner = GmsBarcodeScanning.getClient(applicationContext, options)

                        scanner.startScan()
                            .addOnSuccessListener { barcode ->
                                // Task completed successfully
                                Toast.makeText(
                                    applicationContext,
                                    "SUCCESS: " + barcode.rawValue,
                                    Toast.LENGTH_LONG
                                ).show()
                                scanResult = barcode.rawValue.toString()
                                showContinue = true
                            }
                            .addOnCanceledListener {
                                // Task canceled
                                Toast.makeText(
                                    applicationContext,
                                    "ACTION CANCELLED",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                            .addOnFailureListener { e ->
                                // Task failed with an exception
                                Log.d("FAILURE", e.message.toString())
                                Toast.makeText(
                                    applicationContext,
                                    "FAILURE: " + e.message.toString(),
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                    }) {
                        Text("Scan QR")
                    }
                    Text(scanResult)

                    if (showContinue) {
                        val context = LocalContext.current

                        Button(onClick = {
                            val intent = Intent(context, ProfileActivity::class.java)
                            intent.putExtra("qrValue", scanResult)
                            context.startActivity(intent)
                        }) {
                            Text("Continue")
                        }
                    }
                }
            }
        }
    }
}

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val qrValue = intent.getStringExtra("qrValue") ?: "Unknown"
        setContent {
            LiveView(url = "http://192.168.0.165:4000/home/$qrValue")
        }
    }
}