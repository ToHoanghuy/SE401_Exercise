using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod.FoodItems
{
    public interface IFoodFactory
    {
        IFoodItem CreateFood();
    }
}
