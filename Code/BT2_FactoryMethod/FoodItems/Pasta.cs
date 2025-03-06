using BT2_FactoryMethod.FoodItems;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod.FoodItems
{
    public class Pasta : IFoodItem
    {
        public void Prepare()
        {
            Console.WriteLine("Chuẩn bị pasta: Đun sôi nước và cán bột pasta.");
        }

        public void Cook()
        {
            Console.WriteLine("Nấu pasta trong nước sôi trong 10 phút.");
        }

        public void Serve()
        {
            Console.WriteLine("Phục vụ pasta với sốt và phô mai parmesan.");
        }
    }
}
