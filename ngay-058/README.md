# Ngày 58 · HashSet

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 20 giây

## Bạn học gì

HashSet

## Đáp án câu đố Ngày 57

```java
void main() {
  var dem = new HashMap<String, Long>();
  dem.getOrDefault("An", 5L);
  System.out.println(dem.size());
}
```

In ra: `0`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 58 · HASHSET

Đố hôm qua ra không, vì chỉ hỏi chứ không ghi. An bấm thích hai lần, bạn đoán máy đếm mấy người?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.add("Bình");
  daThich.add("An");
  System.out.println(daThich.size());
}
```

**Đoán trước khi chạy — Máy đếm mấy người?**

- A. `3`
- B. `2`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
2
```

Đáp án đúng: **B**.

Ra hai, vậy cú bấm thứ hai của An biến đi đâu?

### HÉ LỘ — add biết trả lời

Hóa ra lệnh thêm add có trả lời: thêm được hay không. An vào trước, rồi Bình, tập có hai người. An bấm lần nữa, tên đã có nên biến mới nhận false, bị từ chối.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.add("Bình");
  boolean moi = daThich.add("An");
  System.out.println(moi);
  System.out.println(daThich.size());
}
```

Kết quả (máy đã chạy thật):

```text
false
2
```

Thế nên tổng vẫn là hai, không ai bị đếm trùng.

### Ý chính — HASHSET LÀ GÌ — Mỗi tên chỉ một lần

Vậy HashSet giống danh sách khách đã tặng voucher: tên có rồi thì không ghi thêm. Hai chuỗi cùng chữ An tính là một, vì tập so nội dung chứ không so chỗ. Tập còn hỏi có chứa không và gỡ tên ra, nhanh cả khi có triệu người. Nhưng danh sách giấy có thứ tự, còn HashSet tự xếp chỗ, không hứa thứ tự nào.

- **add** — true: mới, false: đã có
- **Không trùng** — cùng nội dung tính là một
- **contains · remove** — hỏi có chưa · gỡ ra
- **Không chỉ số** — máy tự xếp, không get(0)

Ghi nhớ nhanh: không trùng · contains hỏi có · không chỉ số

### THÊM · HỎI · GỠ — Bỏ thích rồi thích lại

Giờ cho An bỏ thích: lệnh gỡ remove xóa tên khỏi tập.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.remove("An");
  boolean coAn = daThich.contains("An");
  System.out.println(coAn);
  if (daThich.add("An")) {
    System.out.println("Báo: An thích");
  }
}
```

Kết quả (máy đã chạy thật):

```text
false
Báo: An thích
```

Hỏi lại bằng contains, nghĩa là có chứa không, máy đáp false. Mẹo dân code: đặt lệnh thêm vào điều kiện, thêm được là thích mới, khỏi hỏi trước. Nên An thích lại thì thông báo hiện đúng một lần.

### LỖI HAY GẶP — Đòi người đầu tiên

Chính chỗ không thứ tự gài bẫy: viết get để lấy người đầu tiên.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  System.out.println(daThich.get(0));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot find symbol
```

Java báo không tìm thấy hàm đó ngay lúc biên dịch. Cần lấy từng người thì duyệt bằng vòng for.

## Tóm lại

Tóm lại: HashSet giữ mỗi giá trị đúng một lần, không có chỉ số. Giờ thì bạn biết cú bấm thứ hai của An đi đâu.

## Câu đố hôm nay

Một người hay hai? Đoán trước, rồi chạy thử. Đáp án ở Ngày 59.

```java
void main() {
  var ten = new HashSet<String>();
  ten.add("an"); ten.add("An");
  System.out.println(ten.size());
}
```

## Bài tập

Đếm số khách khác nhau từ danh sách đơn.
