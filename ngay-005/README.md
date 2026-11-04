# Ngày 5 · int/double, chia nguyên, %

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

int/double, chia nguyên, %

## Code trong video

### NGÀY 5 · INT/DOUBLE, CHIA NGUYÊN, %

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int ngoc = 7;
  System.out.println(ngoc / 2);
}
```

Kết quả (máy đã chạy thật):

```text
3
```

### ĐỔI MỘT CHỮ — Đổi đúng một chữ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  double ngoc = 7;
  System.out.println(ngoc / 2);
}
```

Kết quả (máy đã chạy thật):

```text
3.5
```

### PHÉP LẤY DƯ — % trả về phần dư

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int ngoc = 7;
  int moiDoi = ngoc / 2;
  int conDu = ngoc % 2;
  System.out.println(moiDoi);
  System.out.println(conDu);
  ngoc = ngoc + 1;
  conDu = ngoc % 2;
  System.out.println(conDu);
}
```

Kết quả (máy đã chạy thật):

```text
3
1
0
```

### LỖI HAY GẶP — Thập phân cất vào int

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int ngoc = 7;
  int moiDoi = ngoc / 2.0;
  System.out.println(moiDoi);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: possible lossy
conversion from double to int
```

## Đáp án câu đố Ngày 4

```java
void main() {
  int soDu = 50000;
  soDu = soDu + soDu;
  System.out.println(soDu + soDu);
}
```

In ra: `200000`

## Câu đố hôm nay

Có về lại 9 không? Đoán trước, rồi chạy thử. Đáp án ở Ngày 6.

```java
void main() {
  int ngoc = 9;
  System.out.println(ngoc / 2 * 2);
  System.out.println(ngoc % 2);
}
```

## Bài tập

Có 125 phút, in ra «2 giờ 5 phút» bằng / và %.
