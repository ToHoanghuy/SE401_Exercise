using BT2_FactoryMethod.FoodItems;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod.FoodItems
{
    public class Burger : IFoodItem
    {
        public void Prepare()
        {
            Console.WriteLine("Chuẩn bị burger: Xếp bánh mì, thịt viên và rau củ.");
        }

        public void Cook()
        {
            Console.WriteLine("Nấu burger trên vỉ nướng trong 5 phút.");
        }

        public void Serve()
        {
            Console.WriteLine("Phục vụ burger kèm khoai tây chiên và sốt cà chua.");
        }
    }
}
