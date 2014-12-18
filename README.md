code
====
Code Challenge NL JUG December 2014

Gedachte:
-Stabiele situatie onstaat als alleen een soort van dieren overblifft. Dus aantaal van 2 soorten van dieren moet naar 0.
-Om 2 soorten van dieren verwijderen moeten wij erste die aantalen van dieren gelijk trekken (met minimale verlies).
-Als de verschill tussen aantaal van dieren (2 soorteen) is niet  (a-b) % 2 != 0 dan kan de aantaalen 
niet gelijk worden en die 2 soorten kunnen ook niet gelijk verwijdert worden.
-Dus wij hebben 2 situatie : 
  1.verschillen a-b en b-c en a-c is voor alle gevallen  % 2= 0 , 
    in dit geval overblijf de dier met,max aantaalen , 2 aandere soorten worden verwijdert met de eet operaties, 
  2.het is alleen een paar die aantaal verschill %2=0 , 
    dus de andere soort die niet hoort naar dit paar overblijft, de 2 soorten maken wij gelijk
    
De code:
Het algoritme volg de gedachten. ...
Het is simple een java class ...
    
    

