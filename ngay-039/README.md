# Ngày 39 · Phương thức của đối tượng, toString

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Phương thức của đối tượng, toString

## Code trong video

### NGÀY 39 · PHƯƠNG THỨC, TOSTRING

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Kien { String ten = "Tai nghe"; }
void main() {
  System.out.println(new Kien());
}
```

Kết quả (máy đã chạy thật):

```text
Kien@1dbd16a6
```

Số sau `@` khác mỗi lần chạy; chạy file này bạn sẽ thấy tên lớp kèm tên file, vd `Buoc1$Kien@…`.

### THÊM TOSTRING — Kiện hàng tự khai tên

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Kien {
  String ten = "Tai nghe";
  public String toString() {
    return "Kiện: " + ten;
  }
}
void main() {
  System.out.println(new Kien());
}
```

Kết quả (máy đã chạy thật):

```text
Kiện: Tai nghe
```

### LỖI HAY GẶP — Bỏ public là hỏng

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Kien {
  String ten = "Tai nghe";
  String toString() {
    return "Kiện: " + ten;
  }
}
void main() {
  System.out.println(new Kien());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: toString() in Kien cannot override
toString() in Object
```

### HÀM CỦA ĐỐI TƯỢNG — Mỗi kiện một số riêng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Kien {
  int kg;
  Kien(int k) { kg = k; }
  int phiShip() { return kg * 15000; }
}
void main() {
  int tong = new Kien(2).phiShip();
  tong = tong + new Kien(5).phiShip();
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
105000
```

## Đáp án câu đố Ngày 38

```java
void main() {
  class Phim { int sao = 3;
    Phim(int sao) { sao = 5; } }
  System.out.println(new Phim(9).sao);
}
```

In ra: `3`

## Câu đố hôm nay

Có in ra số 5 không? Đoán trước, rồi chạy thử. Đáp án ở Ngày 40.

```java
void main() {
  class Kien { int phi() { return 5; } }
  System.out.println(new Kien());
}
```

## Bài tập

Thêm toString cho lớp DonHang.
