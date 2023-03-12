package pl.futurecollars.invoicing.model;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class Invoice {

  private int id;
  private LocalDateTime date;
  private Company buyer;
  private Company seller;
  private List<InvoiceEntry> entries;

  public Invoice(int id, LocalDateTime date, Company buyer, Company seller, List<InvoiceEntry> entries) {
    this.id = id;
    this.date = date;
    this.buyer = buyer;
    this.seller = seller;
    this.entries = entries;
  }
}
