# Ngày 28 · Phạm vi biến

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

Phạm vi biến

## Code trong video

### NGÀY 28 · PHẠM VI BIẾN

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  for (int lan = 1; lan <= 3; lan++) {
    int calo = lan * 40;
  }
  System.out.println(calo);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: cannot find symbol
```

### ĐƯA RA NGOÀI — Khai trước vòng lặp

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int calo = 0;
  for (int lan = 1; lan <= 3; lan++) {
    calo = calo + 40;
  }
  System.out.println(calo);
}
```

Kết quả (máy đã chạy thật):

```text
120
```

### THỬ ĐOÁN — Khai trong vòng in tại chỗ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int lan = 1; lan <= 3; lan++) {
    int calo = 0;
    calo = calo + 40;
    System.out.println(calo);
  }
}
```

Kết quả (máy đã chạy thật):

```text
40
40
40
```

## Đáp án câu đố Ngày 27

```java
void main() {
  int veRe = Math.min(90000, 120000);
  int veDat = Math.max(veRe, 100000);
  System.out.println(veDat - veRe);
}
```

In ra: `10000`

## Câu đố hôm nay

Tổng bước in ra là? Đoán trước, rồi chạy thử. Đáp án ở Ngày 29.

```java
void main() {
  int buoc = 6000;
  if (buoc > 5000) { int them = 500; }
  System.out.println(buoc);
}
```

## Bài tập

Sửa ví dụ đầu bài để in được lần cuối ra ngoài vòng.
