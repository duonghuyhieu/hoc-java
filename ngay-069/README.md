# Ngày 69 · Generics (1/2)

Java 100 ngày · 8. Java hiện đại

## Bạn học gì

Generics (1/2): vì sao cần (lỗi lúc chạy → lỗi lúc biên dịch)

## Code trong video

### NGÀY 69 · GENERICS

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  List tui = new ArrayList();
  tui.add("DH01");
  tui.add(50000);
  String ma = (String) tui.get(1);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ClassCastException: class
java.lang.Integer cannot be cast to class
java.lang.String (java.lang.Integer and
java.lang.String are in module java.base
of loader 'bootstrap') (dòng 5)
```

### DÁN NHÃN KIỂU — Dán nhãn cho túi

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  List<String> tui = new ArrayList<>();
  tui.add("DH01");
  tui.add(50000);
  String ma = tui.get(1);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: incompatible types: int cannot be
converted to String
```

### TÚI ĐÚNG KIỂU — Túi đúng kiểu

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  List<String> tui = new ArrayList<>();
  tui.add("DH01");
  tui.add("DH02");
  String dau = tui.get(0);
  int soDon = tui.size();
  System.out.println(dau + " " + soDon);
}
```

Kết quả (máy đã chạy thật):

```text
DH01 2
```

## Đáp án câu đố Ngày 68

```java
void main() {
  record Gio(List<String> ds) {}
  var gio = new Gio(List.of("Pate"));
  System.out.println(gio);
}
```

In ra: `Gio[ds=[Pate]]`

## Câu đố hôm nay

Màn hình hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 70.

```java
void main() {
  var thu = List.of("50", "30");
  String s = thu.get(0) + thu.get(1);
  System.out.println(s);
}
```

## Bài tập

Tự viết lớp Túi riêng: làm sao một lớp dán được đủ loại nhãn?
