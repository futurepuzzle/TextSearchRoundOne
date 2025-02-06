                    +------------------+
                    |      Main        |
                    +------------------+
                    | + main(args:     |
                    |   String[]) :    |
                    |   void           |
                    +------------------+
                              |
                              v
                    +---------------------+
                    |   SearchManager     |
                    +---------------------+
                    | + executeSearch(    |
                    |   word: String) :   |
                    |   List<Match>       |
                    | + setSearchArea(    |
                    |   area: ScreenArea) |
                    |   : void            |
                    +---------------------+
               |                  |                     |
               v                  v                     v
+---------------------+   +-----------------+   +---------------------+
|   InputHandler      |   | ScreenCapture  |   |  SearchAlgorithm     |
+---------------------+   +-----------------+   +---------------------+
| + getUserInput() :  |   | + captureArea( |   | + findMatches(       |
|   String            |   |   area:        |   |   data: Data,        |
| + getScreenArea() : |   |   ScreenArea)  |   |   word: String) :    |
|   ScreenArea        |   |   : Data       |   |   List<Match>        |
+---------------------+   | + saveCapture( |   +---------------------+
                          |   file: File)  |
                          |   : void       |
                          +-----------------+
                                   |
                                   v
                          +----------------+
                          |     Match      |
                          +----------------+
                          | + position:    |
                          |   Point        |
                          | + highlight()  |
                          |   : void       |
                          +----------------+
