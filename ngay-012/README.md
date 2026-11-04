# Ngày 12 · else if & thứ tự điều kiện

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

else if & thứ tự điều kiện

## Code trong video

### NGÀY 12 · ELSE IF & THỨ TỰ ĐIỀU KIỆN

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int diem = 9;
  String loai;
  if (diem >= 5) loai = "Đạt";
  else if (diem >= 8) loai = "Giỏi";
  else loai = "Trượt";
  System.out.println(loai);
}
```

Kết quả (máy đã chạy thật):

```text
Đạt
```

### ĐẢO THỨ TỰ — Hẹp trước, rộng sau

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int diem = 9;
  String loai;
  if (diem >= 8) loai = "Giỏi";
  else if (diem >= 5) loai = "Đạt";
  else loai = "Trượt";
  System.out.println(loai);
}
```

Kết quả (máy đã chạy thật):

```text
Giỏi
```

### BỎ CHỮ ELSE — Hai if rời ghi đè nhau

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int diem = 9;
  String loai = "Trượt";
  if (diem >= 8) {
    loai = "Giỏi";
  } if (diem >= 5) {
    loai = "Đạt";
  }
  System.out.println(loai);
}
```

Kết quả (máy đã chạy thật):

```text
Đạt
```

## Đáp án câu đố Ngày 11

```java
void main() {
  int vang = 40;
  if (vang > 50); { vang = 0; }
  System.out.println(vang);
}
```

In ra: `0`

## Câu đố hôm nay

In ra số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 13.

```java
void main() {
  int diem = 8; if (diem > 8) diem = 1;
  else if (diem > 5) diem = 2;
  System.out.println(diem);
}
```

## Bài tập

Xếp hạng thành viên Đồng/Bạc/Vàng theo số đơn.
