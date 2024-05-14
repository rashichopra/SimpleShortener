# SimpleShortener

This is a very simplified version of a URL Shortener, more likely a string shortener. 
1. Takes as input a string of any length and returns a shorter alphanumeric string of 6 chars 
2. In addition it takes as input the generated short link and returns the original link

There are 2 functions: 
1. To generate the short URL which takes as input the original URL (I used hashmap to store, will use DB in a real world web app for persistance) 
2. To print the original url back when given the short url (this will be a 301 redirect in a real world web app) 

To Run: 
1. Install Java if not already installed
2. clone the repo or copy/paste the Shortit.java file
3. Compile: javac Shortit.java
4. Run: java Shortit
5. When prompted, enter any string of any length greater than 6
6. Program will output a shorter alphanumeric string with 6 chars and the original string back

