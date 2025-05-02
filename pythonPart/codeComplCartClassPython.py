class ShoppingCart:
    def __init__(self):
        self.items = []
        self.total_price = 0

    def add_item(self, item: str, price: float, quantity: int = 1):
        self.items.append({"item": item, "price": price, "quantity": quantity})
        self.total_price += price * quantity
        print(f"Added {quantity} {item}(s) to the cart.")

    def remove_item(self, item: str):
        for idx, cart_item in enumerate(self.items):
            if cart_item["item"] == item:
                self.total_price -= cart_item["price"] * cart_item["quantity"]
                self.items.pop(idx)
                print(f"Removed {item} from the cart.")
                return
        print(f"{item} not found in cart.")
    # 5th This method apply_discount applies a discount to the total_price by the given percentage, if it is between 0 and 100. If the percentage is valid, it reduces the price accordingly and prints a confirmation message. Otherwise, it prints an error message.
    

    def checkout(self):
        print(f"Checking out. Total items: {len(self.items)}, Total price: {self.total_price:.2f}")
        self.items = []
        self.total_price = 0

# 4th  
def calculate_total_with_discount(cart: ShoppingCart, discount_percentage: float):
# Пример использования корзины покупок
    cart = ShoppingCart()
    cart.add_item("Laptop", 1000, 1)
    cart.add_item("Mouse", 25, 2)
    cart.add_item("Keyboard", 50, 1)
    cart.remove_item("Mouse")
    cart.apply_discount(10)  # Применяем скидку 10%
    cart.checkout()
