# Ngày 2 · Đọc lỗi biên dịch (thiếu ;, lệch ngoặc: lỗi phổ biến nhất của người mới)

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

Đọc lỗi biên dịch (thiếu ;, lệch ngoặc: lỗi phổ biến nhất của người mới)

## Code trong video

### NGÀY 2 · ĐỌC LỖI BIÊN DỊCH

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  System.out.println("Vào trận");
  System.out.println("Máu: 100")
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: ';' expected
```

### THÊM MỘT DẤU — Một dấu, cả bài chạy

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  System.out.println("Vào trận");
  System.out.println("Máu: 100");
}
```

Kết quả (máy đã chạy thật):

```text
Vào trận
Máu: 100
```

### LỖI HAY GẶP — Thiếu ngoặc nhọn đóng

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  int mau = 100;
  mau = mau - 30;
  System.out.println("Máu: " + mau);
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: reached end of file while parsing
```

### ĐỦ NGOẶC — Đủ ngoặc, bài chạy

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mau = 100;
  mau = mau - 30;
  System.out.println("Máu: " + mau);
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 70
```

## Đáp án câu đố Ngày 1

```java
void main() {
  System.out.println(20 + 5);
  System.out.println("20 + 5");
}
```

In ra: `25` / `20 + 5`

## Câu đố hôm nay

Thừa một dấu: chạy hay lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 3.

```java
void main() {
  System.out.println("Máu: 100");;
}
```

## Bài tập

Cố ý xóa một dấu } rồi chép lại nguyên văn thông báo lỗi.
