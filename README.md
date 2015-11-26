# ContainsUniqueCharacters
Algorithm to determine if a string has all unique characters.
There cannot be a String with more than 256 unique characters.
Solution is to create an array of boolean values, where the flag at index i indicates
whether character i in the alphabet is contained in the string. If you run across this
character a second time, you can immediately return false.
