/*using System;

namespace StringUtility
{
    public class UtilityStrings
    {
        public string reverseString(String textToReverse)
        {
            char[] charArray = textToReverse.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }

        public String toUpperCaseString(string textToUpper)
        {
            string capLetters = textToUpper.ToUpper();
            return capLetters;
        }

        public String toLowerCaseString(string textToLower)
        {
            string capLetters = textToLower.ToLower();
            return capLetters;
        }
    }
}
/