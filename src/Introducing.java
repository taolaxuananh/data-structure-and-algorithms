/**
 * Thêm phần tử vào mảng
 * leetcode 88.Merge Sorted Array
 * cho hai mảng nums1 và nums2 đã được sắp xếp
 * merge mảng nums1 vào nums2 và sắp xếp
 * input có 4 tham số
 * mảng nums1, m là số lượng của nums1, mảng nums2, n là số lượng của nums2
 * dùng kỹ thuật hai con trỏ
 * sử dụng 3 biến duyệt, i để duyệt nums1, j để duyệt nums2, k để duyệt mảng mới
 * chèn từ cuối vào mảng nums1
 * trỏ i vào số lớn nhất của mảng nums1, trỏ j vào số lớn nhất của mảng nums2, k trỏ vào cuối mảng mới
 * newArray[k] = max(nums1[i], nums2[j])
 * thuật toán sẽ là
 * nếu j < 0 thì newArray[k] = nums1[i]
 * nếu j < 0 thì newArray[k] = nums2[j]
 * if(nums1[i] > nums2[j]) thì newArray[k] = nums1[i]; i--;
 * else nums1[i] <= nums2[j] thì newArray[k] = nums2[j]; j--
 * sau các bước thì đẩy con trỏ k về trước một bước, k--;
 */