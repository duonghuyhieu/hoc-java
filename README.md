# Java 100 ngày — code theo video

[![Kiểm code theo video](https://github.com/duonghuyhieu/hoc-java/actions/workflows/kiem.yml/badge.svg)](https://github.com/duonghuyhieu/hoc-java/actions/workflows/kiem.yml) [![Mở bằng Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/duonghuyhieu/hoc-java)

Code của từng video trong series «Java 100 ngày» trên kênh **Hiếu học mỗi ngày**. Mỗi ngày một thư mục: README ghi bạn học gì, từng đoạn code trên video kèm lệnh chạy và kết quả máy đã chạy thật, câu đố, đáp án câu đố hôm trước và bài tập. Mỗi tuần máy tự chạy lại toàn bộ code để chắc vẫn ra đúng như video.

## Cách học

```bash
git clone https://github.com/duonghuyhieu/hoc-java.git
cd hoc-java
```

1. Xem video ngày N, mở thư mục `ngay-001`… đọc README, chạy từng file.
2. Làm bài trong thư mục `bai-lam/` (git bỏ qua thư mục này): chép thư mục ngày sang đó rồi sửa, vd `bai-lam/ngay-005/`. Đừng sửa thẳng file trong thư mục ngày.
3. Có video mới: `git pull` — vì bài của bạn nằm trong `bai-lam/` nên không bao giờ bị xung đột.

Không dùng git: nút **Code → Download ZIP**. Không muốn cài gì: nút **Mở bằng Codespaces** ở trên (chạy trên trình duyệt, tài khoản GitHub miễn phí có khoảng 60 giờ mỗi tháng).

## Cài đặt

JDK 25 (adoptium.net hoặc jdk.java.net). Chạy thẳng file, không cần biên dịch riêng:

```bash
java ngay-001/Buoc1.java
```

Windows mà chữ có dấu hiện thành `?`: chạy `chcp 65001` một lần trong cửa sổ đó, hoặc `java -Dstdout.encoding=UTF-8 ngay-001/Buoc1.java`.

## Lộ trình

70/100 ngày đã có video.

| Ngày | Bài | Code |
|---:|---|---|
| | **1. Dòng code đầu tiên** | |
| 1 | Chương trình đầu tiên (void main, System.out.println), chạy java Hello.java | [✅ ngay-001](ngay-001/) |
| 2 | Đọc lỗi biên dịch (thiếu ;, lệch ngoặc: lỗi phổ biến nhất của người mới) | [✅ ngay-002](ngay-002/) |
| 3 | Biến (1/2) | [✅ ngay-003](ngay-003/) |
| 4 | Biến (2/2) | [✅ ngay-004](ngay-004/) |
| 5 | int/double, chia nguyên, % | [✅ ngay-005](ngay-005/) |
| 6 | String (1/2) | [✅ ngay-006](ngay-006/) |
| 7 | ÔN + mini hoá đơn trà sữa | [✅ ngay-007](ngay-007/) |
| | **2. Ra quyết định** | |
| 8 | String (2/2) | [✅ ngay-008](ngay-008/) |
| 9 | Nhập từ bàn phím (IO.readln) | [✅ ngay-009](ngay-009/) |
| 10 | boolean & so sánh | [✅ ngay-010](ngay-010/) |
| 11 | if/else | [✅ ngay-011](ngay-011/) |
| 12 | else if & thứ tự điều kiện | [✅ ngay-012](ngay-012/) |
| 13 | && // ! | [✅ ngay-013](ngay-013/) |
| 14 | switch kiểu mới (->) | [✅ ngay-014](ngay-014/) |
| 15 | So sánh String | [✅ ngay-015](ngay-015/) |
| 16 | ÔN (5 câu đố output) | [✅ ngay-016](ngay-016/) |
| 17 | MINI | [✅ ngay-017](ngay-017/) |
| | **3. Lặp lại** | |
| 18 | while | [✅ ngay-018](ngay-018/) |
| 19 | for | [✅ ngay-019](ngay-019/) |
| 20 | break/continue | [✅ ngay-020](ngay-020/) |
| 21 | vòng lặp lồng | [✅ ngay-021](ngay-021/) |
| 22 | Mảng (1/2) | [✅ ngay-022](ngay-022/) |
| 23 | Mảng (2/2) | [✅ ngay-023](ngay-023/) |
| 24 | Ôn tập chặng Lặp lại | [✅ ngay-024](ngay-024/) |
| | **4. Chia nhỏ chương trình** | |
| 25 | Phương thức (1/3) | [✅ ngay-025](ngay-025/) |
| 26 | Phương thức (2/3) | [✅ ngay-026](ngay-026/) |
| 27 | Phương thức (3/3) | [✅ ngay-027](ngay-027/) |
| 28 | Phạm vi biến | [✅ ngay-028](ngay-028/) |
| 29 | var | [✅ ngay-029](ngay-029/) |
| 30 | ArrayList (1/2) | [✅ ngay-030](ngay-030/) |
| 31 | ArrayList (2/2) | [✅ ngay-031](ngay-031/) |
| 32 | ÔN CẤP 1 (10 câu đố) | [✅ ngay-032](ngay-032/) |
| 33 | DỰ ÁN CẤP 1 (1/3) | [✅ ngay-033](ngay-033/) |
| 34 | DỰ ÁN CẤP 1 (2/3) | [✅ ngay-034](ngay-034/) |
| 35 | DỰ ÁN CẤP 1 (3/3) | [✅ ngay-035](ngay-035/) |
| | **5. Lớp & đối tượng** | |
| 36 | Class & object (1/2) | [✅ ngay-036](ngay-036/) |
| 37 | Class & object (2/2) | [✅ ngay-037](ngay-037/) |
| 38 | Constructor & this | [✅ ngay-038](ngay-038/) |
| 39 | Phương thức của đối tượng, toString | [✅ ngay-039](ngay-039/) |
| 40 | Tham chiếu (1/2) | [✅ ngay-040](ngay-040/) |
| 41 | Tham chiếu (2/2) | [✅ ngay-041](ngay-041/) |
| 42 | null & NullPointerException | [✅ ngay-042](ngay-042/) |
| 43 | Đóng gói | [✅ ngay-043](ngay-043/) |
| 44 | static | [✅ ngay-044](ngay-044/) |
| 45 | final | [✅ ngay-045](ngay-045/) |
| 46 | Ôn tập chặng Lớp & đối tượng | [✅ ngay-046](ngay-046/) |
| | **6. Kế thừa & đa hình** | |
| 47 | Kế thừa (1/2) | [✅ ngay-047](ngay-047/) |
| 48 | Kế thừa (2/2) | [✅ ngay-048](ngay-048/) |
| 49 | Đa hình | [✅ ngay-049](ngay-049/) |
| 50 | instanceof có pattern | [✅ ngay-050](ngay-050/) |
| 51 | abstract class | [✅ ngay-051](ngay-051/) |
| 52 | interface (1/2) | [✅ ngay-052](ngay-052/) |
| 53 | interface (2/2) | [✅ ngay-053](ngay-053/) |
| 54 | equals của Object | [✅ ngay-054](ngay-054/) |
| 55 | MINI | [✅ ngay-055](ngay-055/) |
| | **7. Bộ sưu tập & lỗi** | |
| 56 | HashMap (1/2) | [✅ ngay-056](ngay-056/) |
| 57 | HashMap (2/2) | [✅ ngay-057](ngay-057/) |
| 58 | HashSet | [✅ ngay-058](ngay-058/) |
| 59 | record | [✅ ngay-059](ngay-059/) |
| 60 | enum | [✅ ngay-060](ngay-060/) |
| 61 | Sắp xếp (Collections.sort, Comparator.reverseOrder) | [✅ ngay-061](ngay-061/) |
| 62 | Exception (1/3) | [✅ ngay-062](ngay-062/) |
| 63 | Exception (2/3) | [✅ ngay-063](ngay-063/) |
| 64 | Exception (3/3) | [✅ ngay-064](ngay-064/) |
| 65 | StringBuilder & text block | [✅ ngay-065](ngay-065/) |
| 66 | ÔN CẤP 2 | [✅ ngay-066](ngay-066/) |
| 67 | DỰ ÁN CẤP 2 (1/2) | [✅ ngay-067](ngay-067/) |
| 68 | DỰ ÁN CẤP 2 (2/2) | [✅ ngay-068](ngay-068/) |
| | **8. Java hiện đại** | |
| 69 | Generics (1/2) | [✅ ngay-069](ngay-069/) |
| 70 | Generics (2/2) | [✅ ngay-070](ngay-070/) |
| 71 | Lambda (1/2) | ⏳ sắp có |
| 72 | Lambda (2/2) | ⏳ sắp có |
| 73 | Stream (1/3) | ⏳ sắp có |
| 74 | Stream (2/3) | ⏳ sắp có |
| 75 | Stream (3/3) | ⏳ sắp có |
| 76 | Optional | ⏳ sắp có |
| 77 | Sắp xếp đối tượng | ⏳ sắp có |
| 78 | Collections sâu | ⏳ sắp có |
| 79 | sealed + switch pattern (Java 21) | ⏳ sắp có |
| 80 | Ôn tập chặng Java hiện đại | ⏳ sắp có |
| | **9. Ra thế giới ngoài** | |
| 81 | File với NIO (Files, Path) | ⏳ sắp có |
| 82 | try-with-resources | ⏳ sắp có |
| 83 | Ngày giờ (LocalDate) | ⏳ sắp có |
| 84 | Package, import, chạy nhiều file (+ Scanner) | ⏳ sắp có |
| 85 | Maven/Gradle | ⏳ sắp có |
| 86 | JUnit (1/2) | ⏳ sắp có |
| 87 | JUnit (2/2) | ⏳ sắp có |
| 88 | JDBC (1/2) | ⏳ sắp có |
| 89 | JDBC (2/2) | ⏳ sắp có |
| | **10. Song song & JVM** | |
| 90 | Thread (1/2) | ⏳ sắp có |
| 91 | Thread (2/2) | ⏳ sắp có |
| 92 | ExecutorService, Future & virtual threads (Java 21) | ⏳ sắp có |
| 93 | ConcurrentHashMap | ⏳ sắp có |
| 94 | Đệ quy | ⏳ sắp có |
| 95 | JVM | ⏳ sắp có |
| 96 | Debug | ⏳ sắp có |
| | **11. Thiết kế hướng đối tượng** | |
| 97 | Design pattern | ⏳ sắp có |
| 98 | Builder & static class lồng (+ Factory) | ⏳ sắp có |
| | **12. Tốt nghiệp** | |
| 99 | DỰ ÁN CUỐI (1/2) | ⏳ sắp có |
| 100 | DỰ ÁN CUỐI (2/2) | ⏳ sắp có |

## Báo lỗi, hỏi bài

- Code chạy khác video, README sai: [Issues → Báo lỗi bài học](https://github.com/duonghuyhieu/hoc-java/issues/new/choose).
- Hỏi bài, nhờ giải thích: [Discussions](https://github.com/duonghuyhieu/hoc-java/discussions).

## Giấy phép

Code: MIT (`LICENSE`) — dùng thoải mái. Chữ trong README: CC BY 4.0 (`LICENSE-NOI-DUNG.md`) — dùng lại thì ghi công kênh Hiếu học mỗi ngày.
