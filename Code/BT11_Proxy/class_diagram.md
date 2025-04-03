 ```mermaid
classDiagram
    class ClothingImage {
        <<interface>>
        +display() void
    }

    class RealClothingImage {
        -filename: String
        -imageData: String
        +RealClothingImage(filename: String)
        -loadImageFromDisk() void
        +display() void
    }

    class ProxyClothingImage {
        -filename: String
        -realImage: RealClothingImage
        +ProxyClothingImage(filename: String)
        +display() void
    }

    class ClothingItem {
        -name: String
        -price: double
        -image: ClothingImage
        +ClothingItem(name: String, price: double, imageFilename: String)
        +getName() String
        +getPrice() double
        +displayImage() void
        +toString() String
    }

    class ClothingStoreDemo {
        +main(args: String[]) void
    }

    ClothingImage <|.. RealClothingImage
    ClothingImage <|.. ProxyClothingImage
    ClothingItem --> ClothingImage
    ClothingStoreDemo --> ClothingItem
```