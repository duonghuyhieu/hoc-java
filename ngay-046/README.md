# Ngày 46 · Ôn tập chặng Lớp & đối tượng

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Ôn tập chặng Lớp & đối tượng

## Code trong video

### NGÀY 46 · ÔN TẬP LỚP & ĐỐI TƯỢNG

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String maVi = null;
  System.out.println(maVi.length());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.length()" because "maVi" is null
(dòng 3)
```

### NULL — Rỗng khác chưa có gì

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String maVi = "";
  System.out.println(maVi.length());
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### CLASS & NEW — Nạp trăm nghìn còn bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Vi {
  int soDu;
  Vi(int soDu) { soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  System.out.println(vi.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### THIS — Một chữ cứu số dư

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Vi {
  int soDu;
  Vi(int soDu) { this.soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  System.out.println(vi.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
100000
```

### THAM CHIẾU — Ví phụ sửa tiền ví gốc ra sao?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class Vi {
  int soDu;
  Vi(int soDu) { this.soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  Vi viPhu = vi;
  viPhu.soDu = 30000;
  System.out.println(vi.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
30000
```

### LỖI HAY GẶP — Hàm static đọc số dư

File `Loi2.java` — chạy: `java Loi2.java`

```java
class Vi {
  int soDu = 100000;
  static void inSoDu() {
    System.out.println(soDu);
  }
}
void main() {
  Vi.inSoDu();
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: non-static variable soDu cannot be
referenced from a static context
```

## Đáp án câu đố Ngày 45

```java
void main() {
  final int[] kien = {1, 2};
  kien[0] = 9;
  System.out.println(kien[0] + kien[1]);
}
```

In ra: `11`

## Câu đố hôm nay

In ra true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 47.

```java
void main() {
  int[] viGoc = {50000};
  int[] viPhu = {50000};
  System.out.println(viGoc == viPhu);
}
```

## Bài tập

Viết lớp Vi có soDu private, hàm nạp chặn số âm, static đếm tổng số ví.
