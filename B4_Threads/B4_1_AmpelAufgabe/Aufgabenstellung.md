Aufgabenstellung
Erstellen Sie eine Klasse AmpelThread, die das Runnable-Interface implementiert:

Die Klasse soll vier Zustände haben: "rot", "grün", "gelb", "rot-gelb".
Die Zustände sollen in einer Endlosschleife nach einer bestimmten Zeit wechseln.
Fügen Sie einen Konstruktor hinzu, der die Dauer des Zustandswechsels als Integer entgegennimmt:

Der Konstruktor soll die Dauer speichern und einen neuen Thread initialisieren.
Implementieren Sie die run-Methode:

Die run-Methode soll die Zustände in der Reihenfolge "rot", "rot-gelb", "grün", "gelb" durchlaufen.
Jeder Zustand soll für die angegebene Dauer angezeigt werden.
Verwenden Sie Thread.sleep(dauer), um die Dauer des Zustandswechsels zu steuern.
Erstellen Sie eine Methode start, um den Thread zu starten:

Die Methode soll den Thread starten.
Erstellen Sie eine Methode stop, um den Thread zu stoppen:

Die Methode soll eine Möglichkeit bieten, den Thread zu stoppen, wenn eine bestimmte Taste auf der Tastatur gedrückt wird.
Erstellen Sie eine main-Methode, um den Thread zu testen:

Erstellen Sie ein AmpelThread-Objekt mit einer bestimmten Dauer.
Starten Sie den Thread.
Implementieren Sie eine Möglichkeit, den Thread mit der Tastatur zu stoppen (z.B. durch Drücken der Taste 'q').