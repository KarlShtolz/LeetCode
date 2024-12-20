package org.example.solutions;

/**
 * 71. Simplify Path
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to
 * transform this absolute path into its simplified canonical path.
 * The rules of a Unix-style file system are as follows:
 *     A single period '.' represents the current directory.
 *     A double period '..' represents the previous/parent directory.
 *     Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
 *     Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
 * The simplified canonical path should follow these rules:
 *     The path must start with a single slash '/'.
 *     Directories within the path must be separated by exactly one slash '/'.
 *     The path must not end with a slash '/', unless it is the root directory.
 *     The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
 * Return the simplified canonical path.
 *
 * Example 1:
 * Input: path = "/home/"
 * Output: "/home"
 * Explanation:
 * The trailing slash should be removed.
 *
 * Example 2:
 * Input: path = "/home//foo/"
 * Output: "/home/foo"
 * Explanation:
 * Multiple consecutive slashes are replaced by a single one.
 *
 * Example 3:
 * Input: path = "/home/user/Documents/../Pictures"
 * Output: "/home/user/Pictures"
 * Explanation:
 * A double period ".." refers to the directory up a level (the parent directory).
 *
 * Example 4:
 * Input: path = "/../"
 * Output: "/"
 * Explanation:
 * Going one level up from the root directory is not possible.
 *
 * Example 5:
 * Input: path = "/.../a/../b/c/../d/./"
 * Output: "/.../b/d"
 * Explanation:
 * "..." is a valid name for a directory in this problem.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] spath = new String[path.length()];
        int top = -1, i = 0, n = path.length();
        while (i < n) {
            while (i < n && path.charAt(i) == '/')    ++i;
            int e = i;
            while (e < n && path.charAt(e) == '.')    ++e;
            if (e > i && ((e == n && e - i == 1) || (e < n && e - i == 1 && path.charAt(e) == '/'))) {
                i = e;
                continue;
            }
            if (e > i && ((e == n && e - i == 2) || (e < n && e - i == 2 && path.charAt(e) == '/'))) {
                if (top != -1)    --top;
                i = e;
                continue;
            }
            if (i == n)    break;
            int s = i;
            while (i < n && path.charAt(i) != '/')    ++i;
            spath[++top] = path.substring(s, i);
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i <= top; ++i) {
            sb.append("/");
            sb.append(spath[i]);
        }
        if (sb.length() == 0)   sb.append("/");
        return sb.toString();
    }
}