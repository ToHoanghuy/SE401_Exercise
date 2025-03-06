using BT2_FactoryMethod.FoodItems;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod
{
    public class Restaurant
    {
        public void OrderFood(IFoodFactory factory)
        {
            IFoodItem food = factory.CreateFood();
            food.Prepare();
            food.Cook();
            food.Serve();
            Console.WriteLine("Đơn hàng hoàn tất!\n");
        }
    }
}
