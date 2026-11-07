# Ngày 65 · StringBuilder & text block

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 21 giây

## Bạn học gì

StringBuilder & text block

## Đáp án câu đố Ngày 64

```java
void main() {
  int xu = 0; try { xu = 9 / xu; }
  catch (Exception e) { xu = 5; }
  System.out.println(xu);
}
```

In ra: `5`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 65 · STRINGBUILDER & TEXT BLOCK

Đố hôm qua ra năm: catch gán lại xu. Danh sách Lofi, ghép Chill bằng concat, đoán xem in ra gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String nhac = "Lofi";
  nhac.concat(" Chill");
  System.out.println(nhac);
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `Lofi Chill`
- B. `Lofi`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Lofi
```

Đáp án đúng: **B**.

Chỉ ra Lofi — Chill rơi đâu mất?

### ĐỔI HAI CHỮ — Đổi hai chữ, kết quả đổi

Đó là vì String đóng băng: ghép ra chuỗi mới, không ai giữ. Đổi sang bộ ghép chuỗi, nối bằng append: thêm vào đuôi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var nhac = new StringBuilder("Lofi");
  nhac.append(" Chill");
  System.out.println(nhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi Chill
```

Giờ ra Lofi Chill: nó sửa trên chính mình.

### NỐI TRONG VÒNG LẶP — Ba vòng, một tờ nháp

Thế còn ba bài nữa? Cho vòng lặp nối. Vòng một thêm Bài một; append trả về chính nó. Vòng hai thêm Bài hai.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var nhac = new StringBuilder("Lofi");
  nhac.append(" Chill");
  for (int i = 1; i <= 3; i++) {
    nhac.append(" | Bài ").append(i);
  }
  System.out.println(nhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi Chill | Bài 1 | Bài 2 | Bài 3
```

Vòng ba xong, nhãn vẫn số một: chỉ một tờ nháp. Còn dấu cộng mỗi vòng chép lại cả chuỗi: chậm.

### Ý chính — TRỌNG TÂM — Tờ nháp và hóa đơn mẫu

Vậy bộ ghép là tờ nháp: chép thêm từng dòng, khỏi in lại cả tờ. Chỗ gãy: nháp chưa phải chuỗi, muốn cất phải chốt lại. Còn hóa đơn mẫu nhiều dòng chính là text block.

- **String** — đóng băng; + trong vòng lặp chậm
- **StringBuilder** — tờ nháp, append nối đuôi
- **toString()** — chốt nháp thành chuỗi
- **text block** — """ nhiều dòng nguyên văn

Ghi nhớ nhanh: append nối đuôi · toString chốt chuỗi · """ hóa đơn mẫu

### TEXT BLOCK — Text block giữ nguyên dòng

Giờ dựng thẻ bài hát: xuống dòng giữ nguyên. Dấu đóng đứng đâu, Java cắt lề trái tới đó.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int luotNghe = 1200;
  String theNhac = """
      Lofi Chill
      Lượt nghe: %d
      """.formatted(luotNghe);
  System.out.println(theNhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi Chill
Lượt nghe: 1200
```

Mẹo dân code: formatted điền lượt nghe vào chỗ trống.

### LỖI HAY GẶP — Chữ dính dấu mở

Nhưng kéo Lofi Chill sát dấu mở thì sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int luotNghe = 1200;
  String theNhac = """Lofi Chill
      Lượt nghe: %d
      """.formatted(luotNghe);
  System.out.println(theNhac);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: illegal text block open delimiter
sequence, missing line terminator
```

Java từ chối: dấu mở phải xuống dòng. Sửa: dấu mở đứng riêng một dòng.

## Tóm lại

Tóm lại: nối nhiều lần dùng bộ ghép, nhiều dòng dùng text block.

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 66.

```java
void main() {
  var nhac = new StringBuilder("Pop");
  var moi = nhac.append(" Rock");
  System.out.println(nhac + "/" + moi);
}
```

## Bài tập

In danh sách 5 bài hát bằng StringBuilder, mỗi bài một dòng.
