# Dokumentasi Penggunaan WebView

### Langkah 1: Menambahkan Izin Internet
tambahkan  internet permission di didalam file 'AndroidManifest.xml':
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

### Langkah 2: Menambahkan WebView
tambahkan webview di layout XML untuk menampilkan chatbot dan beri id pada webview tersebut:
```xml
<WebView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:id="@+id/webView"/>
```

### Langkah 3: Inisialisasi id WebView
inisialisasi id webView pada activity / fragment untuk diolah:
```kotlin
webViiew = findViewById<WebView>(R.id.webView)
```

### Langkah 4: Setting WebView
setting URL pada webView, arahkan URL ke alamat chatbot dan aktifkan mode webView untuk javaScript:
```kotlin
        webViiew.loadUrl("https://cloud-object-storage-cos-standard-10m.s3.jp-tok.cloud-object-storage.appdomain.cloud/bot-assistant-mobile.html")
        webViiew.settings.javaScriptEnabled = true
```

