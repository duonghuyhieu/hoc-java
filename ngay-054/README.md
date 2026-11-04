# Ngày 54 · equals của Object

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

equals của Object

## Code trong video

### NGÀY 54 · EQUALS CỦA OBJECT

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Bai {
  String ten = "Ngày mưa";
}
void main() {
  var daCo = new Bai();
  var moi = new Bai();
  System.out.println(daCo.equals(moi));
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### ĐỔI MỘT DÒNG — Trỏ chung một bài

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Bai {
  String ten = "Ngày mưa";
}
void main() {
  var daCo = new Bai();
  var moi = daCo;
  System.out.println(daCo.equals(moi));
}
```

Kết quả (máy đã chạy thật):

```text
true
```

### GHI ĐÈ EQUALS — Tự định nghĩa giống nhau

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Bai {
  String ten = "Ngày mưa";
  public boolean equals(Object o) {
    return ten.equals(((Bai) o).ten);
  }
}
void main() {
  Bai daCo = new Bai(), moi = new Bai();
  System.out.println(daCo.equals(moi));
}
```

Kết quả (máy đã chạy thật):

```text
true
```

### LỖI HAY GẶP — So với null

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Bai {
  String ten = "Ngày mưa";
  public boolean equals(Object o) {
    return ten.equals(((Bai) o).ten);
  }
}
void main() {
  Bai daCo = new Bai(), moi = new Bai();
  System.out.println(daCo.equals(null));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot read field
"ten" because "o" is null (dòng 4)
```

## Đáp án câu đố Ngày 53

```java
void main() {
  CharSequence matKhau = "";
  System.out.println(matKhau.isEmpty());
}
```

In ra: `true`

## Câu đố hôm nay

So chữ hay so địa chỉ? Đoán trước, rồi chạy thử. Đáp án ở Ngày 55.

```java
void main() {
  Object ten1 = "Mưa";
  Object ten2 = new String("Mưa");
  System.out.println(ten1.equals(ten2));
}
```

## Bài tập

Viết equals cho bài hát: trùng khi cùng tên bài và cùng ca sĩ.
