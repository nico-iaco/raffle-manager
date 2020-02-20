
# Raffle manager
[![CodeFactor](https://www.codefactor.io/repository/github/nico-iaco/raffle-manager/badge)](https://www.codefactor.io/repository/github/nico-iaco/raffle-manager)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![HitCount](http://hits.dwyl.com/nico-iaco/raffle-manager.svg)](http://hits.dwyl.com/nico-iaco/raffle-manager)

This project is a utility for ruffle applications.

## Feature
 - Number exctractor
 - Raffle folder generator
 - more feature will be added as soon as possible

 ## How to use
 Add this into your **pom.xml**
 ``` xml
 <dependency>
    <groupId>it.iacovelli</groupId>
    <artifactId>ruffleManager</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
### Use number extractor
In your application instantiate a new **NumberExtractor** with the starting and the ending number of the range, then you can use the
**getNumber()** method to extract a random number.
Remember to call the **initialize()** after you finish to extract numbers if you want retry.
### Use folder generator
In your application instantiate a new **RuffleFolderGenerator** with the starting and the ending number of the range, then you can use
the **generateRuffleFolder(folderNumber)** method with the folder number you want to use.
