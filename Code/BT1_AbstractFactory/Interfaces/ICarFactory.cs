using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Interfaces
{
    public interface ICarFactory
    {
        ISedan CreateSedan();
        ISUV CreateSUV();
        IElectronic CreateElectronic();
    }
}
