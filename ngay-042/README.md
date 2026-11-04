# Ngày 42 · null & NullPointerException

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

null & NullPointerException

## Code trong video

### NGÀY 42 · NULL & NULLPOINTEREXCEPTION

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String maGiam = "";
  System.out.println(maGiam.length());
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### ĐỔI MỘT TỪ — Rỗng đổi thành null

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String maGiam = null;
  System.out.println(maGiam.length());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.length()" because "maGiam" is null
(dòng 3)
```

### HỎI TRƯỚC KHI ĐO — Kiểm tra trước khi gọi

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String maGiam = null;
  int doDai = 0;
  if (maGiam != null) {
    doDai = maGiam.length();
  }
  System.out.println(doDai);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### CÓ MÃ THẬT — Một đoạn code hai trường hợp

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String maGiam = "NHAC9";
  int doDai = 0;
  if (maGiam != null) {
    doDai = maGiam.length();
  }
  System.out.println(doDai);
}
```

Kết quả (máy đã chạy thật):

```text
5
```

### LỖI HAY GẶP — Trường chưa gán cũng là null

File `Loi2.java` — chạy: `java Loi2.java`

```java
class GoiNhac {
  String maGiam;
}

void main() {
  GoiNhac goi = new GoiNhac();
  int doDai = goi.maGiam.length();
  System.out.println(doDai);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.length()" because "goi.maGiam" is
null (dòng 7)
```

## Đáp án câu đố Ngày 41

```java
void main() {
  int[] tong = {200};
  int[] banSao = tong; banSao[0] = 0;
  System.out.println(tong[0]);
}
```

In ra: `0`

## Câu đố hôm nay

Sập hay in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 43.

```java
void main() {
  String maGiam = null;
  System.out.println(maGiam + "!");
}
```

## Bài tập

Tên bài hát có thể null: kiểm tra null trước khi gọi length().
