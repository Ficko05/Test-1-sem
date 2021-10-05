using NUnit.Framework;
using MyLib;

namespace StringUtiliyTest
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void reverseTest()
        {
            UtilityStrings reverse = new UtilityStrings();

            string result = reverse.reverseString("abc");

            Assert.AreEqual("cba",result);
        }

        [Test]
        public void toUppercaseText()
        {
            UtilityStrings capital = new UtilityStrings();

            string result = capital.toUpperCaseString("abc");

            Assert.AreEqual("ABC", result);
        }
        [Test]
        public void toLowerCaseText()
        {
            UtilityStrings capital = new UtilityStrings();

            string result = capital.toLowerCaseString("ABC");

            Assert.AreEqual("abc", result);
        }
    }
}