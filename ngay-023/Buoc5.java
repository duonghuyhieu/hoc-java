void main() {
  int[] xu = {-20, -5, -40};
  int lonNhat = xu[0];
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
