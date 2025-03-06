using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Models
{
    public class AsianElectronic : IElectronic
    {
        public string GetEngine() => "150 kW Electric Motor";
        public string GetSeat() => "Eco Fabric";
        public string GetSize() => "Compact";
    }
}
