# Ngày 37 · Class & object (2/2)

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Class & object (2/2): nhiều đối tượng + «bộ mặt đầy đủ» public class/public static void main(String[] args)

## Code trong video

### NGÀY 37 · CLASS & OBJECT

File `Loi1.java` — chạy: `java Loi1.java`

```java
public class Main {
  void main() { }
  System.out.println("Máu: 100");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: <identifier> expected
```

### ĐƯA VÀO MAIN — Cửa vào của chương trình

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
public class Main {
  public static void main(
      String[] args) {
    System.out.println("Máu: 100");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 100
```

### NHIỀU ĐỐI TƯỢNG — Một khuôn hai nhân vật

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  NhanVat hiepSi = new NhanVat();
  NhanVat rong = new NhanVat();
  hiepSi.mau = 70;
  int mauRong = rong.mau;
  System.out.println(mauRong);
}
class NhanVat {
  int mau = 100;
}
```

Kết quả (máy đã chạy thật):

```text
100
```

### ĐỔI MỘT CHỖ — Bỏ new thì sao?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  NhanVat hiepSi = new NhanVat();
  NhanVat rong = hiepSi;
  hiepSi.mau = 70;
  int mauRong = rong.mau;
  System.out.println(mauRong);
}
class NhanVat {
  int mau = 100;
}
```

Kết quả (máy đã chạy thật):

```text
70
```

## Đáp án câu đố Ngày 36

```java
void main() {
  class Meo { int tuoi = 1; }
  new Meo().tuoi = 9;
  System.out.println(new Meo().tuoi);
}
```

In ra: `1`

## Câu đố hôm nay

true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 38.

```java
void main() {
  class Rong { int mau = 100; }
  Rong lua = new Rong();
  System.out.println(lua == new Rong());
}
```

## Bài tập

Viết bản đủ public class, tạo hai nhân vật khác máu rồi in.
