/**
 * String được cấu tạo từ các characters.
 * char là kiểu nguyên thủy của Character.
 * char mặc định là mã ascii và có thể biểu diễn bằng sô tức mà mỗi ký tự trên màn hình đều được biểu diễn bằng số
 * trong java char có kích thước 2 byte và là mã unicode
 * String pool: chứa tất cả ký tự được khai báo trực tiếp bằng String (string literal), toán tử == so sánh xem có
 * đang trỏ cùng một tham chiếu trong bộ nhớ hay không. equals() được implement bởi String để so sánh nội dung của
 * các object.
 * leet code 387
 * Input: s = "leetcode"
 * Output: 0
 * Input: s = "loveleetcode"
 * Output: 2
 * Input: s = "aabb"
 * Output: -1
 * tìm trong input ký tự nào không bị lặp lại thì return ra index của nó
 * còn nếu không tìm thấy ký tự nào thỏa mãn thì return -1
 */