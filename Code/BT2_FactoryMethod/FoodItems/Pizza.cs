using BT2_FactoryMethod.FoodItems;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod.FoodItems
{
    public class Pizza : IFoodItem
    {
        public void Prepare()
        {
            Console.WriteLine("Chuẩn bị pizza: cán bột và thêm toppings.");
        }

        public void Cook()
        {
            Console.WriteLine("Nấu pizza trong lò nướng ở 200°C trong 15 phút.");
        }

        public void Serve()
        {
            Console.WriteLine("Phục vụ pizza nóng kèm bánh mì tỏi.");
        }
    }
}
