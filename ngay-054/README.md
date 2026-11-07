# Ngày 54 · equals của Object

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 23 giây

## Bạn học gì

equals của Object

## Đáp án câu đố Ngày 53

```java
void main() {
  CharSequence matKhau = "";
  System.out.println(matKhau.isEmpty());
}
```

In ra: `true`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 54 · EQUALS CỦA OBJECT

Đáp án hôm qua: true, chuỗi rỗng thật. Playlist có sẵn bài Ngày mưa, thêm bài đó lần nữa, máy thấy trùng không?

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

**Đoán trước khi chạy — Máy thấy trùng không?**

- A. `true`
- B. `false`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
false
```

Đáp án đúng: **B**.

Máy bảo không, dù tên y hệt — vậy equals đang so cái gì?

### ĐỔI MỘT DÒNG — Trỏ chung một bài

Giờ cho biến mới trỏ thẳng vào bài đã có. Hai biến giờ cùng nhãn một, lúc nãy là một với hai.

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

Máy báo trùng: equals gốc chỉ hỏi có cùng một đối tượng.

### Ý chính — KHÁI NIỆM — equals gốc so địa chỉ

Chính vì mọi lớp ngầm kế thừa Object nên nhận sẵn cách so này. Hai bản nhạc cùng tên vẫn là hai bản khác nhau, trừ khi bạn định nghĩa giống là gì. Nhưng bạn nhìn tên là biết trùng, Java thì không. Muốn so theo tên thì ghi đè hàm này, giữ tham số kiểu Object.

- **Object** — cha chung của mọi lớp
- **equals gốc** — chỉ trùng khi cùng đối tượng
- **Ghi đè** — tự định nghĩa «giống nhau»
- **Tham số Object** — giữ nguyên kiểu của cha

Ghi nhớ nhanh: Object cha chung · Mặc định cùng địa chỉ · Ghi đè tự định nghĩa

### GHI ĐÈ EQUALS — Tự định nghĩa giống nhau

Thế thì viết hàm so trong lớp bài hát, tham số nhận mọi thứ. Bên trong, ép về bài hát rồi so hai cái tên.

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

Hai bài vẫn tạo riêng, nhưng giờ máy báo trùng.

### LỖI HAY GẶP — So với null

Còn đem bài hát so với null, tức chẳng có gì? Đúng luật phải ra false, bạn đoán máy in gì?

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

**Đoán trước khi chạy — So với null, in gì?**

- A. `false`
- B. `Lỗi khi chạy`
- C. `true`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot read field
"ten" because "o" is null (dòng 4)
```

Đáp án đúng: **B**.

Sập vì con trỏ rỗng: null làm gì có tên để đọc. Mẹo dân code: kiểm tra instanceof trước khi ép, sai kiểu thì trả false.

## Tóm lại

Tóm lại: equals gốc so địa chỉ, nên playlist chẳng thấy bài trùng.

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
