using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Models
{
    public class AsianSUV : ISUV
    {
        public string GetEngine() => "2.5L Hybrid";
        public string GetSeat() => "Synthetic Leather";
        public string GetSize() => "Medium";
    }
}
