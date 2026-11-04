# Ngày 40 · Tham chiếu (1/2)

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Tham chiếu (1/2): hai biến một đối tượng

## Code trong video

### NGÀY 40 · THAM CHIẾU

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = viAn;
  viBinh.soDu = 500000;
  System.out.println(viAn.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
500000
```

### ĐỔI MỘT CHỖ — Bình có ví riêng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = new Vi();
  viBinh.soDu = 500000;
  System.out.println(viAn.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### SOI NHÃN — Ba biến, mấy cái ví?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = viAn;
  var viChi = new Vi();
  System.out.println(viAn == viChi);
  viChi = viAn;
  System.out.println(viAn == viChi);
}
```

Kết quả (máy đã chạy thật):

```text
false
true
```

### LỖI HAY GẶP — Tưởng gán là sao lưu

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  viAn.soDu = 500000;
  var viBinh = viAn;
  viAn.soDu = 0;
  int soLan = 1000000 / viBinh.soDu;
  System.out.println(soLan);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArithmeticException: / by zero (dòng 7)
```

## Đáp án câu đố Ngày 39

```java
void main() {
  class Kien { int phi() { return 5; } }
  System.out.println(new Kien());
}
```

In ra: `Main$1Kien@1dbd16a6`

## Câu đố hôm nay

In ra mã nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 41.

```java
void main() {
  String maVi = "AN01";
  String maBan = maVi; maBan = "BI02";
  System.out.println(maVi);
}
```

## Bài tập

Truyền ví vào một hàm rồi nạp tiền, ví ngoài có đổi không?
