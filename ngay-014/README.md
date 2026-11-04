# Ngày 14 · switch kiểu mới (->)

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

switch kiểu mới (->)

## Code trong video

### NGÀY 14 · SWITCH KIỂU MỚI

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int thu = 2;
  switch (thu) {
    case 2: System.out.println("Vai");
    case 3: System.out.println("Tay");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Vai
Tay
```

### KIỂU MỚI — Đổi sang mũi tên

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int thu = 2;
  switch (thu) {
    case 2 -> System.out.println("Vai");
    case 3 -> System.out.println("Tay");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Vai
```

### SWITCH TRẢ GIÁ TRỊ — Gộp ô, trả giá trị

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int thu = 7;
  String buoiTap = switch (thu) {
    case 2 -> "Vai";
    case 7, 8 -> "Chạy bộ";
    default -> "Nghỉ";
  };
  System.out.println(buoiTap);
}
```

Kết quả (máy đã chạy thật):

```text
Chạy bộ
```

### CODE CŨ VẪN GẶP — Quên break là lọt

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int thu = 2;
  String buoiTap = "Nghỉ";
  switch (thu) {
    case 2: buoiTap = "Vai";
    case 3: buoiTap = "Tay";
  }
  System.out.println(buoiTap);
}
```

Kết quả (máy đã chạy thật):

```text
Tay
```

## Đáp án câu đố Ngày 13

```java
void main() {
  boolean coVe = true;
  boolean duTuoi = false;
  System.out.println(!(coVe && duTuoi));
}
```

In ra: `true`

## Câu đố hôm nay

Calo in ra bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 15.

```java
void main() {
  int calo = 300 + switch (8) {
    case 7, 8 -> 200; default -> 0; };
  System.out.println(calo);
}
```

## Bài tập

Đổi size S, M, L thành giá trà sữa bằng switch.
