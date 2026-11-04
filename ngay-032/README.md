# Ngày 32 · ÔN CẤP 1 (10 câu đố)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

ÔN CẤP 1 (10 câu đố)

## Code trong video

### NGÀY 32 · ÔN CẤP 1

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  System.out.println("Nghe " + 1 + 2);
}
```

Kết quả (máy đã chạy thật):

```text
Nghe 12
```

### CÂU 1 · LỜI GIẢI — Chuỗi đứng trước là nối chữ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  System.out.println("Nghe " + (1 + 2));
}
```

Kết quả (máy đã chạy thật):

```text
Nghe 3
```

### CÂU 2 · SO SÁNH — Giống chữ khác nhãn

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String goc = "Mua";
  String sao = new String(goc);
  System.out.println(goc == sao);
  System.out.println(goc.equals(sao));
}
```

Kết quả (máy đã chạy thật):

```text
false
true
```

### CÂU 7 · VÒNG LẶP — Tổng lượt nghe ba bài

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int[] luot = {3, 5, 4};
  int tong = 0;
  for (int i = 1; i < 3; i++) {
    tong = tong + luot[i];
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
9
```

### CÂU 8 · LỖI KHI CHẠY — Mẹo dân code: luot.length

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int[] luot = {3, 5, 4};
  int tong = 0;
  for (int i = 0; i <= 3; i++) {
    tong = tong + luot[i];
  }
  System.out.println(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArrayIndexOutOfBoundsException: Index 3
out of bounds for length 3 (dòng 5)
```

### CÂU 9 · LỖI HAY GẶP — Biến ở đâu sống ở đó

File `Loi2.java` — chạy: `java Loi2.java`

```java
int tangLuot(int luot) {
  int moi = luot + 1;
  return moi;
}
void main() {
  tangLuot(5);
  System.out.println(moi);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 7: cannot find symbol
```

## Đáp án câu đố Ngày 31

```java
void main() {
  var tui = new ArrayList<>(List.of(1));
  Integer ma = 1; tui.remove(ma);
  System.out.println(tui);
}
```

In ra: `[]`

## Câu đố hôm nay

Dòng cuối in gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 33.

```java
void main() {
  int[] luot = {2, 4};
  var tong = luot[0] + luot[1];
  System.out.println(tong + 1 + " lần");
}
```

## Bài tập

Cộng lượt nghe playlist 5 bài, dùng length làm điều kiện lặp.
