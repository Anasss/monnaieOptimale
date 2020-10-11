public class Monnaie {
  private long piece2;
  private long billet5;
  private long billet10;

  public Monnaie() {
  }

  public Monnaie(long piece2, long billet5, long billet10) {
    this.piece2 = piece2;
    this.billet5 = billet5;
    this.billet10 = billet10;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Monnaie monnaie = (Monnaie)o;
    return piece2 == monnaie.piece2 && billet5 == monnaie.billet5 && billet10 == monnaie.billet10;
  }

  /**
   * Compute the optimal monnaie to be returned for a given amount s.
   *
   * @param s
   * @return optimal monnaie composed of 2, 5 and 10e tickets.
   */
  public static Monnaie monnaieOptimale(long s) {
    // Impossible case
    if (s <= 1) {
      return null;
    }

    Monnaie result = new Monnaie();

    if (s >= 10) {
      result.billet10 = s / 10;
      s = s % 10;
    }
    if (s % 2 == 0 && s <= 8) {
      result.piece2 = s / 2;
    } else {
      result.billet5 = s / 5;
      s = s % 5;
      result.piece2 = s / 2;
      s = s % 2;
    }
    return result;
  }
}
