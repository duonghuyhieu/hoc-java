# Ngày 11 · if/else

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

if/else

## Code trong video

### NGÀY 11 · IF/ELSE

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int vang = 30;
  if (vang >= 50); {
    System.out.println("Mua kiếm!");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Mua kiếm!
```

### BẢN CHUẨN — Nếu đúng thì… còn không thì…

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int vang = 30;
  if (vang >= 50) {
    System.out.println("Mua kiếm!");
  } else {
    System.out.println("Cày thêm.");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Cày thêm.
```

### LỖI HAY GẶP — Một dấu cắt rời if

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int vang = 30;
  if (vang >= 50); {
    System.out.println("Mua kiếm!");
  } else {
    System.out.println("Cày thêm.");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: 'else' without 'if'
```

### XÓA MỘT DẤU — Đủ vàng mới mua

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int vang = 70;
  if (vang >= 50) {
    vang = vang - 50;
    System.out.println("Mua kiếm!");
  } else {
    System.out.println("Cày thêm.");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Mua kiếm!
```

## Đáp án câu đố Ngày 10

```java
void main() {
  int soDu = 5000;
  System.out.println(soDu != 5000);
  System.out.println(soDu <= 5000);
}
```

In ra: `false` / `true`

## Câu đố hôm nay

In ra 40 hay 0? Đoán trước, rồi chạy thử. Đáp án ở Ngày 12.

```java
void main() {
  int vang = 40;
  if (vang > 50); { vang = 0; }
  System.out.println(vang);
}
```

## Bài tập

Tổng đơn từ 300.000 đồng in «Freeship», ngược lại in phí 15.000.
