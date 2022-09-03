<h2><a href="https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/">1888. Minimum Number of Flips to Make the Binary String Alternating</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a binary string <code style="user-select: auto;">s</code>. You are allowed to perform two types of operations on the string in any sequence:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><strong style="user-select: auto;">Type-1: Remove</strong> the character at the start of the string <code style="user-select: auto;">s</code> and <strong style="user-select: auto;">append</strong> it to the end of the string.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Type-2: Pick</strong> any character in <code style="user-select: auto;">s</code> and <strong style="user-select: auto;">flip</strong> its value, i.e., if its value is <code style="user-select: auto;">'0'</code> it becomes <code style="user-select: auto;">'1'</code> and vice-versa.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of <strong style="user-select: auto;">type-2</strong> operations you need to perform</em> <em style="user-select: auto;">such that </em><code style="user-select: auto;">s</code> <em style="user-select: auto;">becomes <strong style="user-select: auto;">alternating</strong>.</em></p>

<p style="user-select: auto;">The string is called <strong style="user-select: auto;">alternating</strong> if no two adjacent characters are equal.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, the strings <code style="user-select: auto;">"010"</code> and <code style="user-select: auto;">"1010"</code> are alternating, while the string <code style="user-select: auto;">"0100"</code> is not.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "111000"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation</strong>: Use the first operation two times to make s = "100011".
Then, use the second operation on the third and sixth elements to make s = "10<u style="user-select: auto;">1</u>01<u style="user-select: auto;">0</u>".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "010"
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation</strong>: The string is already alternating.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "1110"
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation</strong>: Use the second operation on the second element to make s = "1<u style="user-select: auto;">0</u>10".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'0'</code> or <code style="user-select: auto;">'1'</code>.</li>
</ul>
</div>