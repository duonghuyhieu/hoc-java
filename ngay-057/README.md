# Ngày 57 · HashMap (2/2)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 21 giây

## Bạn học gì

HashMap (2/2): đếm tần suất

## Đáp án câu đố Ngày 56

```java
void main() {
  var kho = new HashMap<>();
  kho.put("Áo", 1);
  System.out.println(kho.put("Áo", 2));
}
```

In ra: `1`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 57 · HASHMAP: ĐẾM TẦN SUẤT

Câu đố hôm qua ra một, put trả lại giá trị cũ.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String[] ghiBan = {"An", "Huy", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    dem.put(ten, dem.get(ten) + 1);
  }
  System.out.println(dem);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"java.lang.Integer.intValue()" because the
return value of
"java.util.Map.get(Object)" is null (dòng
6)
```

Đếm bàn thắng từng cầu thủ: An, Huy, rồi An, vậy mà sập luôn. Chỉ một dòng cộng thêm một, bạn soi ra chỗ chết chưa?

### SỬA CHỖ SẬP — Chưa có thì coi là 0

Thủ phạm: lần đầu gặp An, bảng chưa có tên nên trả null, cộng một là sập. Nên đổi sang lệnh lấy kèm giá trị mặc định: tên chưa có thì lấy số không. Vòng một, An từ không lên một. Vòng hai, Huy có bàn đầu tiên.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String[] ghiBan = {"An", "Huy", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    int cu = dem.getOrDefault(ten, 0);
    dem.put(ten, cu + 1);
  }
  System.out.println(dem);
}
```

Kết quả (máy đã chạy thật):

```text
{An=2, Huy=1}
```

Vòng ba, An gặp lại nên lên hai.

### Ý chính — CÁCH ĐẾM — Mỗi bàn thêm một gạch

Vậy đếm kiểu này giống người ghi sổ trận đấu: mỗi bàn thắng thêm một gạch cạnh tên. Khác là người ghi sổ tự hiểu tên mới bằng không, còn map phải được dặn. Nên mỗi vòng đúng ba bước: lấy số cũ, cộng một, rồi put ghi đè. Kết quả là bảng tần suất: tên kèm số lần.

- **getOrDefault** — lấy số cũ, chưa có thì 0
- **cu + 1** — thêm một gạch
- **put** — ghi đè số mới
- **Tần suất** — tên → số lần

Ghi nhớ nhanh: Tần suất tên → số lần · getOrDefault chưa có = 0 · put ghi đè

### BẪY THỨ TỰ — Đổi Huy thành Vũ

Nhưng thử đổi Huy thành Vũ, An vẫn ghi bàn trước. Bạn đoán xem, bảng in An trước hay Vũ trước?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String[] ghiBan = {"An", "Vũ", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    int cu = dem.getOrDefault(ten, 0);
    dem.put(ten, cu + 1);
  }
  System.out.println(dem);
}
```

**Đoán trước khi chạy — An ghi trước, ai được in trước?**

- A. `{An=2, Vũ=1}`
- B. `{Vũ=1, An=2}`

Kết quả (máy đã chạy thật):

```text
{Vũ=1, An=2}
```

Đáp án đúng: **B**.

Vũ đứng đầu, vì HashMap xếp theo mã băm của tên, không theo lượt thêm. Nên đừng tin thứ tự in ra của map.

### MẸO DÂN CODE — Hai dòng gom thành một

Còn hai dòng lấy rồi ghi kia, dân code gom thành một lệnh merge. Tên mới đặt số một, tên cũ thì cộng dồn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String[] ghiBan = {"An", "Vũ", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    dem.merge(ten, 1, Integer::sum);
  }
  System.out.println(dem);
}
```

Kết quả (máy đã chạy thật):

```text
{Vũ=1, An=2}
```

Kết quả y hệt, và giờ bạn biết vì sao đoạn đầu sập.

## Tóm lại

Tóm lại: tên mới chưa có gạch, nên lấy kèm số không.

## Câu đố hôm nay

In ra mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 58.

```java
void main() {
  var dem = new HashMap<String, Long>();
  dem.getOrDefault("An", 5L);
  System.out.println(dem.size());
}
```

## Bài tập

Đếm số lần mỗi khách đặt hàng.
