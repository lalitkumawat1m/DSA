<h2><a href="https://leetcode.com/problems/stream-of-characters/">1032. Stream of Characters</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design an algorithm that accepts a stream of characters and checks if a suffix of these characters is a string of a given array of strings <code style="user-select: auto;">words</code>.</p>

<p style="user-select: auto;">For example, if <code style="user-select: auto;">words = ["abc", "xyz"]</code>&nbsp;and the stream added the four characters (one by one) <code style="user-select: auto;">'a'</code>, <code style="user-select: auto;">'x'</code>, <code style="user-select: auto;">'y'</code>, and <code style="user-select: auto;">'z'</code>, your algorithm should detect that the suffix <code style="user-select: auto;">"xyz"</code> of the characters <code style="user-select: auto;">"axyz"</code> matches <code style="user-select: auto;">"xyz"</code> from <code style="user-select: auto;">words</code>.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">StreamChecker</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">StreamChecker(String[] words)</code> Initializes the object with the strings array <code style="user-select: auto;">words</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">boolean query(char letter)</code> Accepts a new character from the stream and returns <code style="user-select: auto;">true</code> if any non-empty suffix from the stream forms a word that is in <code style="user-select: auto;">words</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["StreamChecker", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query"]
[[["cd", "f", "kl"]], ["a"], ["b"], ["c"], ["d"], ["e"], ["f"], ["g"], ["h"], ["i"], ["j"], ["k"], ["l"]]
<strong style="user-select: auto;">Output</strong>
[null, false, false, false, true, false, true, false, false, false, false, false, true]

<strong style="user-select: auto;">Explanation</strong>
StreamChecker streamChecker = new StreamChecker(["cd", "f", "kl"]);
streamChecker.query("a"); // return False
streamChecker.query("b"); // return False
streamChecker.query("c"); // return False
streamChecker.query("d"); // return True, because 'cd' is in the wordlist
streamChecker.query("e"); // return False
streamChecker.query("f"); // return True, because 'f' is in the wordlist
streamChecker.query("g"); // return False
streamChecker.query("h"); // return False
streamChecker.query("i"); // return False
streamChecker.query("j"); // return False
streamChecker.query("k"); // return False
streamChecker.query("l"); // return True, because 'kl' is in the wordlist
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of lowercase English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">letter</code> is a lowercase English letter.</li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">4 * 10<sup style="user-select: auto;">4</sup></code> calls will be made to query.</li>
</ul>
</div>