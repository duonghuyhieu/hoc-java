# Ngày 60 · enum

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

enum

## Code trong video

### NGÀY 60 · ENUM

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String cheDo = "Rung";
  boolean rung = cheDo.equals("RUNG");
  System.out.println(rung);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### ĐỔI SANG ENUM — Đổi chuỗi thành enum

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  CheDo cheDo = CheDo.RUNG;
  boolean rung = cheDo == CheDo.RUNG;
  System.out.println(rung);
}
```

Kết quả (máy đã chạy thật):

```text
true
```

### ĐỔI CHẾ ĐỘ — Chuỗi thành hằng enum

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  var cheDo = CheDo.CHUONG;
  cheDo = CheDo.IM_LANG;
  var chon = CheDo.valueOf("IM_LANG");
  System.out.println(cheDo == chon);
  System.out.println(cheDo);
}
```

Kết quả (máy đã chạy thật):

```text
true
IM_LANG
```

### LỖI HAY GẶP — Gõ chữ thường vào valueOf

File `Loi1.java` — chạy: `java Loi1.java`

```java
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  var nhap = "im_lang";
  var cheDo = CheDo.valueOf(nhap);
  System.out.println(cheDo);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
IllegalArgumentException: No enum constant
CheDo.im_lang (dòng 4)
```

## Đáp án câu đố Ngày 59

```java
void main() {
  record Xe(String bien, int cho) {}
  var xe = new Xe("29A", 7);
  System.out.println(xe);
}
```

In ra: `Xe[bien=29A, cho=7]`

## Câu đố hôm nay

true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 61.

```java
void main() {
  enum Pin { DAY, YEU, CAN }
  var pin = Pin.YEU;
  System.out.println(pin.equals("YEU"));
}
```

## Bài tập

Viết switch in thông báo cho từng chế độ chuông, rung, im lặng.
