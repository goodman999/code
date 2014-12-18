code
====
Code Challenge NL JUG December 2014

Gedachte:
-Stabiele situatie onstaat als alleen een soort van dieren overblijft. Dus aantaal van 2 soorten van dieren moet naar 0.

-Om 2 soorten van dieren verwijderen moeten wij erste die aantalen van dieren gelijk trekken (met minimale verlies van dieren).

-Als de verschill tussen aantaal van dieren (2 soorteen) is oneven (a-b) % 2 == 1 dan kan de aantaalen 
niet gelijk worden en die 2 soorten kunnen ook niet gelijk verwijdert worden.
-Dus wij hebben 2 situatie : 
  1. Verschillen a-b en b-c en a-c is voor alle gevallen  % 2= 0 , 
    in dit geval overblijf de dier met,max aantaalen bijvoorbeeld a, 
    de 2 soorten (bijvoorbeeld b,c en b >c ) maken wij gelijk en dana een eet andere en die 2 soorten worden verwijdert, 
    meest optimaal word bij gelijkmaking de verschil weggewerkt met eet operacies,
    dus aantaal van b word c, dus b-c word verwijdert. Dus aantaal van b,c zijn belijk c. Die eeten elkaar en rsultaat c-aantaal dieren van overblijvende soort en die word totaal a+c;
    
  2. Het is alleen een paar die aantaal verschil is even %2=0 , 
    dus de andere soort die niet hoort naar dit paar overblijft, 
    de 2 soorten maken wij gelijk en dana een eet andere en die 2 soorten worden verwijdert, nu gelijke stapen als in geval #1.
    
De code:
Het algoritme volg de gedachten. ...
Het is een simpel een korte java class ...
    
    

