Bibliothek einbinden:
---------------------
1. Neues Projekt mit der IDE erstellen
2. Neuer Ordner namens "lib" innerhalb des Projektes anlegen
3. Gehe auf ABBTS Fileablage
4. Inhalt vom Ordner "60_Bibliotheken/AccessControl" nach "lib" kopieren
5. In der IDE: 
   Menü: File -> Project Structure -> Libraries
6. Button "+" klicken
7. Java auswählen
8. "lib"-Ordner auswählen
9. 4 mal Button "OK" klicken


Klasse Model aus Bibliothek im Code importieren:
------------------------------------------------
import ch.abbts.model.Model;


Klasse Model im Code verwenden:
-------------------------------
Model.in.isPressed(port);


JavaDoc im Browser anzeigen:
----------------------------
lib/javadoc/index.html


JavaDoc in der IDE anzeigen:
----------------------------
Model. und CTRL-Q -> Quick Documentation


