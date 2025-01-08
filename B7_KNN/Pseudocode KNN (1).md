# KNN Algorithmus
Der KNN Algorithmus ist dient der Klassifizierung von Objekten aufgrund vpn Merkmalen. Vorraussetzung sind bereits vorhandene klassifizierte Datenbojekte.
Hier wird ein Beispiel mit lediglich 2 Merkmalen (2 Dimensionen) betrachtet.

## Datenobjekt Klasse erstellen
Jedes Datenobjekt hat 2 Merkmale die wir `x`und `y` benennen.
Es soll 2 mögliche Ergebnisse (Klassen) `0` und `1` geben.
```python
Dataobjekt{
    int x
    int y
    int klasse
}
```


## Pseudocode Testszenarion im Hauptprogramm
```python
main(){
    Dataobjekt testdaten[] <- initTestdaten() 
    k   <- 5
    x   <- 5
    y   <- 2
    neu <- NEU Dataobjekt(x,y)
    int klasseNeu <- kNN(neu, testDaten, k)
    ausgabe klasseNeu
}
```

## Pseudocode kNN
```python
+knn(neu:Dataobjekt, testdaten:Dataobjekt[], k:int)
abstaende:Map<double, Dataobjekt> <- new TreeMap<>()
FÜR o:testdaten
    dist <- getDistance(neu, o)
    abstaende.put(dist, o)
ENDE FÜR
List<Dataobjekt> knns <- ArrayList<Dataobjekt>(abstaende.values())
klasse0 <- 0
klasse1 <- 0 

FÜR i=0 bis i<k erhöhe i um 1
    klasseDesNachbarn <- knns.get(i).klasse
    WENN klasseDesNachbarn = 0
        klasse0++
    SONST
        klasse1++
    ENDE WENN
ENDE FÜR

WENN klasse0 > klasse 1
    neu.klasse <- 0
SONST
    neu.klasse <- 1
ENDE WENN

Return neu.klasse

```