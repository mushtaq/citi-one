
println()

sealed trait Customer
object Customer {
  case object Reward extends Customer
  case object Regular extends Customer
}

sealed trait Day
object Day {
  case object Weekday extends Day
  case object Weekend extends Day
}

case class Category(day: Day, customer: Customer)

case class BookingRequest(customer: Customer, days: List[Day]) {
  def categories = days.map(day => Category(day, customer))
}

case class Hotel(name: String, rating: Int, rateCard: Map[Category, Int]) {
  def priceFor(bookingRequest: BookingRequest): Int = {
    bookingRequest.categories.map(rateCard).sum
  }
}

class BookingService(hotels: List[Hotel]) {
  def findBestHotel(bookingRequest: BookingRequest): String = {
    hotels.minBy(hotel => (hotel.priceFor(bookingRequest), -hotel.rating)).name
  }
}
