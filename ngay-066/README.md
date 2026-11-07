# Ngày 66 · ÔN CẤP 2

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 34 giây

## Bạn học gì

ÔN CẤP 2

## Đáp án câu đố Ngày 65

```java
void main() {
  var nhac = new StringBuilder("Pop");
  var moi = nhac.append(" Rock");
  System.out.println(nhac + "/" + moi);
}
```

In ra: `Pop Rock/Pop Rock`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 66 · ÔN CẤP 2

Hôm qua in Pop Rock hai lần, vì cùng một bộ ghép.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record CauThu(String ten) {}
void main() {
  var doi = new HashSet<CauThu>();
  doi.add(new CauThu("Long"));
  doi.add(new CauThu("Long"));
  System.out.println(doi.size());
}
```

Kết quả (máy đã chạy thật):

```text
1
```

Tạo cầu thủ Long hai lần, thả vào tập hợp đội bóng, máy đếm ra một. Hai đối tượng riêng, sao tập hợp coi là một?

### ĐỔI KHUÔN — record đổi thành class

Thế thì đổi record sang lớp thường class, giữ nguyên hai dòng thêm Long. Lần này tập hợp đếm mấy người, bạn đoán đi?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class CauThu {
  String ten;
  CauThu(String ten) { this.ten = ten; }
}
void main() {
  var doi = new HashSet<CauThu>();
  doi.add(new CauThu("Long"));
  doi.add(new CauThu("Long"));
  System.out.println(doi.size());
}
```

**Đoán trước khi chạy — Giờ tập đếm mấy người?**

- A. `1`
- B. `2`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
2
```

Đáp án đúng: **B**.

Ra hai, vì lớp thường so theo địa chỉ, tạo hai lần là hai người. Còn record tự so theo dữ liệu, cùng tên Long là trùng.

### Ý chính — ÔN NHANH — Hai thứ khi nào là một

Hóa ra cả chặng bộ sưu tập xoay quanh một câu: khi nào hai thứ là một. Bản đồ HashMap gặp khóa trùng thì lặng lẽ đè giá trị cũ. Tập hợp HashSet bỏ phần tử trùng, trùng hay không do hàm so sánh quyết định. Kiểu liệt kê enum khóa cứng các giá trị như thắng, hòa, thua.

- **HashMap** — khóa trùng thì đè giá trị cũ
- **HashSet** — tự bỏ phần tử trùng
- **record** — so bằng theo dữ liệu
- **enum** — tập giá trị cố định

Ghi nhớ nhanh: sort xếp thứ tự · try catch bắt lỗi · throw tự ném lỗi

### THAM CHIẾU — Hai biến một danh sách

Vậy gán đội hình cho biến dự bị thì thành hai danh sách à? Không: cả hai cùng nhãn một, cùng trỏ một danh sách thật.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
record CauThu(String ten) {}
void main() {
  var doiHinh = new ArrayList<CauThu>();
  doiHinh.add(new CauThu("Long"));
  var duBi = doiHinh;
  duBi.add(new CauThu("Huy"));
  System.out.println(doiHinh.size());
}
```

Kết quả (máy đã chạy thật):

```text
2
```

Thêm Huy qua dự bị, đội hình cũng tăng lên hai người.

### LỖI HAY GẶP — Khóa vắng trong bản đồ

Nhưng hỏi bảng bàn thắng về Huy, người chưa có trong bảng, chương trình sập.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var banThang = Map.of("Long", 2);
  int banCuaHuy = banThang.get("Huy");
  System.out.println(banCuaHuy);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"java.lang.Integer.intValue()" because the
return value of
"java.util.Map.get(Object)" is null (dòng
3)
```

Bảng trả về rỗng null, nhét vào số nguyên là văng lỗi con trỏ rỗng. Mẹo của dân code: dùng lệnh lấy kèm mặc định, đưa sẵn số không cho khóa vắng.

### TỔNG KẾT CHẶNG: BỘ SƯU TẬP & LỖI

Quay lại bức tranh lớn: cấp hai gồm ba chặng, lớp, kế thừa, bộ sưu tập. Hôm nay Long và Huy đã chạm đủ: record, tham chiếu, bản đồ thiếu khóa. Lưu thẻ này lại, mai làm dự án sẽ cần.

- Ngày 36 · Lớp & đối tượng — Class & object, Constructor & this, Phương thức của…
- Ngày 47 · Kế thừa & đa hình — Kế thừa, Đa hình, instanceof có pattern, abstract…
- Ngày 56 · Bộ sưu tập & lỗi — HashMap, HashSet, record, enum, Sắp xếp…

## Tóm lại

Tóm lại: trùng hay không là do cách so bằng quyết định.

## Câu đố hôm nay

Tập đếm mấy người? Đoán trước, rồi chạy thử. Đáp án ở Ngày 67.

```java
void main() {
  var doi = new HashSet<String>();
  doi.add("Long"); doi.add("long");
  System.out.println(doi.size());
}
```

## Bài tập

Lưu bàn thắng 3 cầu thủ vào HashMap, in người ghi nhiều nhất.
